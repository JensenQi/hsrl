package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BabblingBook_39169 : Card() {
    override val id = 39169
    override val name = "呓语魔典"
    override val description = "<b>战吼：</b>随机将一张法师法术牌置入你的 手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Karazhan
    override val background = "它梦想有一天能像《荆棘谷的青山》一样，“永远”留在冒险者的任务日志里。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/db5b9475859a0995edf8ed384a80ddf31f91f9c183f2a2216d2c397eaa1895d2.png"
}
