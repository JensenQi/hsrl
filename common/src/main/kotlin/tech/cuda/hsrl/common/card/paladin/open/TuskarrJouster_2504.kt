package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TuskarrJouster_2504 : Card() {
    override val id = 2504
    override val name = "海象人龟骑士"
    override val description = "<b>战吼：</b>揭示双方牌库里的一张随从牌。如果你的牌法力值消耗较大，则为你的英雄恢复 7点生命值。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Tgt
    override val background = "也不知道骑着海龟参加枪术比赛算不算违规……"
    override val artist = "Skan Srisuwan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f6b93f0048309d9729779f86d11acac888a37beae5d35ef9695ee32487c1e044.png"
}
