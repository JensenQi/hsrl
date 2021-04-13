package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Mechwarper_1940 : Card() {
    override val id = 1940
    override val name = "机械跃迁者"
    override val description = "你的机械的法力值消耗减少（1）点。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "能够召唤机械的机械？然后呢？能够召唤馒头的馒头？唔……"
    override val artist = "Phil Saunders"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7ef308cf5d03e44f43700a45876441736341ab30da4240a4b1ccca28c7c77be4.png"
}
