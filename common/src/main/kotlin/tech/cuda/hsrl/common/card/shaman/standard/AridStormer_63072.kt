package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AridStormer_63072 : Card() {
    override val id = 63072
    override val name = "旱地风暴"
    override val description = "<b>战吼：</b>如果你在上个回合使用过元素牌，则获得<b>突袭</b>和<b>风怒</b>。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "有些人追逐风暴，而有些风暴追逐元素。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/13608e333547d659824e9853d9cad817bca49a1682e1b69ab5804e723489376a.png"
}
