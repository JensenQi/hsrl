package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CorpseRaiser_42909 : Card() {
    override val id = 42909
    override val name = "唤尸者"
    override val description = "<b>战吼：</b>使一个友方随从获得“<b>亡语：</b>再次召唤该随从。”"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "他只是在自管自埋头摆弄尸体，是你们这些冒险者要来找麻烦的。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/897e01c99a3dccd003db2f6634aca8d1cc6507eca070b3be2ebe23d11f1505b2.png"
}
