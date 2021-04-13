package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Treenforcements_55039 : Card() {
    override val id = 55039
    override val name = "树木援军"
    override val description = "<b>抉择：</b>使一个随从获得+2生命值和<b>嘲讽</b>；或者召唤一个2/2的树人。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.DescentOfDragons
    override val background = "难以树计的后援力量！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f47e5ad4cd1393e03bb14ca11e937ad449a9d8392f0351906ac34938e6ce4c84.png"
}
