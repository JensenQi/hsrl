package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArenaPatron_50403 : Card() {
    override val id = 50403
    override val name = "竞技场奴隶主"
    override val description = "<b>超杀：</b>召唤另一个竞技场奴隶主。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "所有有票的，都过来！"
    override val artist = "Eric Braddock"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3f011280965892f37a4068ae9b1f6043e50bab3cafce726f9ce68044e334cd8e.png"
}
