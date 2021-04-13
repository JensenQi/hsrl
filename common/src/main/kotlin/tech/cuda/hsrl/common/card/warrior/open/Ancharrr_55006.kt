package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Ancharrr_55006 : Card() {
    override val id = 55006
    override val name = "海盗之锚"
    override val description = "在你的英雄攻击后，从你的牌库中抽一张海盗牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.DescentOfDragons
    override val background = "用锚当武器有一个问题：经常在牌库中沉底。"
    override val artist = "Grace Liu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/967bc148a8e81ba4b9c410fb890084b8349f40b00198112d433d34ac53da924c.png"
}
