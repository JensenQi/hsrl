package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TournamentMedic_2575 : Card() {
    override val id = 2575
    override val name = "赛场医师"
    override val description = "<b>激励：</b>为你的英雄恢复 2点生命值。"
    override var cost: Int? = 4
    override var health: Int? = 8
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "其实医师也有锦标赛，只不过没那么热闹罢了。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cd07eed2ae1d0426b570b08c84f1fa6c57de1ccdc21cb8ddc74c09fbcf9f15d9.png"
}
