package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeathwingTheDestroyer_66872 : Card() {
    override val id = 66872
    override val name = "灭世者死亡之翼"
    override val description = "<b>战吼：</b>消灭所有其他随从。每消灭一个随从，便弃一张牌。"
    override var cost: Int? = 10
    override var health: Int? = 12
    override var attack: Int? = 12
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "“他是死亡之翼？那个也是死亡之翼？你也是死亡之翼！？我才是死亡之翼！这里到底有多少死亡之翼？”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/64c782f181dcfb529fb4983025e39ef7483740cbb9c23723124f554fe61728e8.png"
}
