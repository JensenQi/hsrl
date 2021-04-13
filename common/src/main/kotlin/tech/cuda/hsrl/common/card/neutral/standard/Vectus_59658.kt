package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Vectus_59658 : Card() {
    override val id = 59658
    override val name = "维克图斯"
    override val description = "<b>战吼：</b>召唤两条1/1的雏龙。每条雏龙获得一个本局对战中死亡的友方随从的<b>亡语</b>。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "不要害怕这些黑暗魔法。他会确保顺利孵化不会搞砸。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d42c9f902ea7b8a56b4cb75a5eeb28ee7e0a62c76713df94fae0514167252b44.png"
}
