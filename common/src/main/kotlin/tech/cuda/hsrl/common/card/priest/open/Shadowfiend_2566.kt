package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shadowfiend_2566 : Card() {
    override val id = 2566
    override val name = "暗影魔"
    override val description = "每当你抽一张牌时，使其法力值消耗减少（1）点。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Tgt
    override val background = "野百合也会有春天，暗影魔也想要朋友。"
    override val artist = "Warren Mahy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5d8717f583daa2aaf45763fce5ee4bce91f7a0cfe0c1186974b189e3cae4f825.png"
}
