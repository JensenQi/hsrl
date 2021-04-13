package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodfenRaptor_216 : Card() {
    override val id = 216
    override val name = "血沼迅猛龙"
    override val description = ""
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "“去杀30条迅猛龙。”——赫米特·奈辛瓦里"
    override val artist = "Dan Brereton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ee9fb52364367426bc0466da583b4fc8ebd30351ff96215fe644de179cc1fe49.png"
}
