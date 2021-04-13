package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritsingerUmbra_41289 : Card() {
    override val id = 41289
    override val name = "灵魂歌者安布拉"
    override val description = "在你召唤一个随从后，触发其<b>亡语</b>。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "听到她歌声的随从们纷纷选择了…死亡。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/de3841f02d3f49e9996deff9dd62b44bcff98d3e9131e0f205ca5d219623820d.png"
}
