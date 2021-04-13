package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PowerWordReplicate_49013 : Card() {
    override val id = 49013
    override val name = "真言术：仿"
    override val description = "选择一个友方随从，召唤一个该随从的5/5复制。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.BoomsdayProject
    override val background = "现已加入真言术合集。同系列还有：爆炸、复生和歼灭。"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8adca370297ab7cf58ae43edf6e52e0a3586dfe86a881b77a74399bb324053a8.png"
}
