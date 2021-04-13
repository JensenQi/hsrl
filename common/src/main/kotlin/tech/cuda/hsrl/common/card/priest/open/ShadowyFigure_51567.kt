package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadowyFigure_51567 : Card() {
    override val id = 51567
    override val name = "阴暗的人影"
    override val description = "<b>战吼：</b> 变形成为一个友方<b>亡语</b>随从的2/2复制。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RiseOfShadows
    override val background = "让他来比手影简直是场灾难：“猜猜这是什么……一只触手！那这次呢……是两只触手！”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f405246f700541ef6459b8f838d8582b030f09a3df86dbf844663303c1f52887.png"
}
