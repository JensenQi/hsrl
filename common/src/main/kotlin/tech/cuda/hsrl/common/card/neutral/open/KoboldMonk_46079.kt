package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KoboldMonk_46079 : Card() {
    override val id = 46079
    override val name = "狗头人武僧"
    override val description = "你的英雄无法成为法术或英雄技能的 目标。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "烛即是空，空即是烛。"
    override val artist = "Sam Nielson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8032a5cf7778c33ca308a068046eb61001d6b9f74ee34c83a3a31e4fe48f7cbf.png"
}
