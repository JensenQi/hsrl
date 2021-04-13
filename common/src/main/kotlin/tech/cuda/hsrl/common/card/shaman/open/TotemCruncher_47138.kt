package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TotemCruncher_47138 : Card() {
    override val id = 47138
    override val name = "图腾啃食者"
    override val description = "<b>嘲讽，战吼：</b>消灭你的所有图腾。每消灭一个图腾，便获得+2/+2。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.TheWitchwood
    override val background = "图腾都是上好的磨牙棒。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/46f78a6ca46fb8ee076732d01448d6587465162d8e58771ff92f621679b597c4.png"
}
