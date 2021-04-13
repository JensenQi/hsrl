package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Jeeves_2062 : Card() {
    override val id = 2062
    override val name = "基维斯"
    override val description = "在每个玩家的回合结束时，该玩家抽若干牌，直至其手牌数量达到3张。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "他是有史以来最熟练、最高效、最有礼貌的服侍机器人。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ff21cff5b5a971d8fc390c64d234b689dc2fa97564f9eef5d7213d365750a0b7.png"
}
