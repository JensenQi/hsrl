package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Demonfuse_2535 : Card() {
    override val id = 2535
    override val name = "恶魔融合"
    override val description = "使一个恶魔获得+3/+3，使你的对手获得一个法力水晶。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Tgt
    override val background = "摆弄恶魔法术可是一件极其危险的事情。"
    override val artist = "Kevin Chen"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6ec9001c2c88992c2cfa1b1c320ab39e98dd4524cf78b64ec55bc89f82d35f53.png"
}
