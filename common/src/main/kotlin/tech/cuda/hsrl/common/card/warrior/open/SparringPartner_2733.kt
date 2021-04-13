package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SparringPartner_2733 : Card() {
    override val id = 2733
    override val name = "格斗陪练师"
    override val description = "<b>嘲讽</b> <b>战吼：</b>使一个随从获得<b>嘲讽</b>。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Tgt
    override val background = "你来打我呀。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0d3432556c4d4af46d1d03886358f03b47458c9fd5dc7b4ed2d9877f8ec37e40.png"
}
