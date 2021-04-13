package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpawnOfNzoth_38797 : Card() {
    override val id = 38797
    override val name = "恩佐斯的子嗣"
    override val description = "<b>亡语：</b>使你的所有随从获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "别看恩佐斯长得那么惊悚，它的子嗣却出奇的可爱。这些黏呼呼臭烘烘的小家伙们最得女性玩家的恩宠了！"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/18f397a26ae57382cd573b3de8c75c14dd082bc6347576d677bb06959db39a3d.png"
}
