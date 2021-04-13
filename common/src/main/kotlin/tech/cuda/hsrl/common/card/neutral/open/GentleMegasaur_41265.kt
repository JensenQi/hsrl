package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GentleMegasaur_41265 : Card() {
    override val id = 41265
    override val name = "温顺的巨壳龙"
    override val description = "<b>战吼：</b><b>进化</b>你所有的鱼人。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "廉价壳屋招租啦！房客仅限情感丰富，温良恭让的双足两栖人型生物，喜好流浪生活者更佳！"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5c7b07b2255435aeaa1ac3bf4bce22d50a41774a131e3ec9b97fa0135b785e00.png"
}
