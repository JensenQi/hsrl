package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SanguineReveler_45321 : Card() {
    override val id = 45321
    override val name = "血色狂欢者"
    override val description = "<b>战吼：</b>消灭一个友方随从，并获得+2/+2。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Kotf
    override val background = "干了这一杯，喝完好上路！"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/717d57e1e8db4ad33303993c63c662384205c84499eb55788f56698b128c8946.png"
}
