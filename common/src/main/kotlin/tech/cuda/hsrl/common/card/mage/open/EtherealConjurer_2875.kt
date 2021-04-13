package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EtherealConjurer_2875 : Card() {
    override val id = 2875
    override val name = "虚灵巫师"
    override val description = "<b>战吼： 发现</b>一张法术牌。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Loe
    override val background = "虽然听起来有点“虚”，但他的确很有实力。"
    override val artist = "Ben Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7798bafba00f76fb3ab3a454a29526a58e4d8e0dbf2e6c784a2f0983afcf4790.png"
}
