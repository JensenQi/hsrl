package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StonesplinterTrogg_2035 : Card() {
    override val id = 2035
    override val name = "碎石穴居人"
    override val description = "每当你的对手施放一个法术，便获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "比穴居人的气味更让人受不了的是他们的诗歌。"
    override val artist = "Peet Cooper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7325411ec0ab07fca90a76542503a894ad85109b530728308ffd765a51f78132.png"
}
