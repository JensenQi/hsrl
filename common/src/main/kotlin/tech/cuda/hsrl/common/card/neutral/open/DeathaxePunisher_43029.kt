package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeathaxePunisher_43029 : Card() {
    override val id = 43029
    override val name = "亡斧惩罚者"
    override val description = "<b>战吼：</b>随机使你手牌中一个具有<b>吸血</b>的随从获得+2/+2。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "一把奥金斧没什么好怕的，两把才可怕。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/44e4e84a4b31dfd6da8645b269e46b2d976a16d1390c06677a70f8ae77a8d4d7.png"
}
