package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrizePlunderer_61171 : Card() {
    override val id = 61171
    override val name = "奖品掠夺者"
    override val description = "<b>连击：</b>在本回合中，你每使用一张其他牌，便对一个随从造成1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "抢得到奖品，却永远也抢不回快乐的童年。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/87c9d78341fb9c616cd37c1053f57074d6251a533c5f21a5a9a98665739fe248.png"
}
