package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SparkEngine_49170 : Card() {
    override val id = 49170
    override val name = "火花引擎"
    override val description = "<b>战吼：</b>将一张1/1并具有<b>突袭</b>的“火花”置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "它要追随巴基·奥尔德林的脚步。"
    override val artist = "L Chanchai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/33bcbd52b393124b5a7238c7d49c70cf6972fad859ac0256ff77dee850cebf29.png"
}
