package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VerdantLongneck_40971 : Card() {
    override val id = 40971
    override val name = "苍绿长颈龙"
    override val description = "<b>战吼：</b><b>进化</b>。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Ungoro
    override val background = "因为脖子长的缘故，他总爱窥探别人的家长里短。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b4715dbc783af5069d71a160fe8a4b9e47a35169449d0920b03a7884247c54e6.png"
}
