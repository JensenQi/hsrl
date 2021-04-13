package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SparkjoyCheat_61954 : Card() {
    override val id = 61954
    override val name = "欢脱的作弊选手"
    override val description = "<b>战吼：</b>如果你的手牌中有<b>奥秘</b>牌，将其施放并抽一张牌。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "开了挂，还有什么乐趣？"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/850eeec457c7406588aa351467bed9d903a6d28b311b8f6939a1d09bd29a4f10.png"
}
