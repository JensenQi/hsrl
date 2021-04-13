package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Aluneth_43426 : Card() {
    override val id = 43426
    override val name = "艾露尼斯"
    override val description = "在你的回合结束时，抽三张牌。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "不可阻挡的奥术之力……却被困在这么小的空间里。"
    override val artist = "Izzy Hoover"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f6b0cef8dcf89dae0ed670269e20bd40259256f287784b80a9fb8ef4809502ba.png"
}
