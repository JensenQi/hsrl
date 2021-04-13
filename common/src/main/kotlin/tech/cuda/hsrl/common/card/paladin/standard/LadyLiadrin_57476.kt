package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LadyLiadrin_57476 : Card() {
    override val id = 57476
    override val name = "女伯爵莉亚德琳"
    override val description = "<b>战吼：</b>将你在本局对战中施放在友方角色上的所有法术的复制置入你的手牌。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.AshesOfOutland
    override val background = "对法术的爱有两种，一种叫放手，一种叫放入手牌。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e830658303d33617a881e2496dad186537bc6083f70acec121d0088ed9d6263c.png"
}
