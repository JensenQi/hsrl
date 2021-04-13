package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SparkDrill_47979 : Card() {
    override val id = 47979
    override val name = "火花钻机"
    override val description = "<b>突袭，亡语：</b>将两张1/1并具有<b>突袭</b>的“火花”置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 1
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "砰砰博士的牙医最喜欢的武器。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c4bc1a64cc3d710e48e12c4abed7b68d6375ab3119609bd958deb57a9c6c207b.png"
}
