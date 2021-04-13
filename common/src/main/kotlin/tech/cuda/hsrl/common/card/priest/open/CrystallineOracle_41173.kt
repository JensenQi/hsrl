package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrystallineOracle_41173 : Card() {
    override val id = 41173
    override val name = "结晶预言者"
    override val description = "<b>亡语：</b>复制你对手的牌库中的一张牌，并将其置入你的手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Ungoro
    override val background = "他的心里藏不了任何事，所以看起来很阳光。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a84466434a484cf128389161bb5c1d65951b1a28b87d16a5207dea1d363ddb5.png"
}
