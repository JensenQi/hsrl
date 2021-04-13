package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ParadeLeader_61235 : Card() {
    override val id = 61235
    override val name = "巡游领队"
    override val description = "在你召唤一个<b>突袭</b>随从后，使其获得+2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "随从跑得快，全凭领头带。领队带好头，随从有劲头。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c3ce648d0c4c16e976558abb4290f8b726c8cba9002c1ff7bfb1417d2b8d54bc.png"
}
