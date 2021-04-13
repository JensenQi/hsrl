package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GraveHorror_50539 : Card() {
    override val id = 50539
    override val name = "墓园恐魔"
    override val description = "<b>嘲讽</b> 在本局对战中，你每施放一个法术就会使法力值消耗减少（1）点。"
    override var cost: Int? = 12
    override var health: Int? = 8
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RastakhansRumble
    override val background = "巨魔可以再生断肢，而这就是滥用此能力的产物。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c1ff5d7a2ce72d500d92c010e3aa23bf77ee4a2a6b5ea229f9e8833940bd49a6.png"
}
