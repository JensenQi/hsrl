package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BabblingBook_69700 : Card() {
    override val id = 69700
    override val name = "呓语魔典"
    override val description = "<b>战吼：</b>随机将一张法师法术牌置入你的 手牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Core
    override val background = "它梦想有一天能像《荆棘谷的青山》一样，“永远”留在冒险者的任务日志里。"
    override val artist = "A. J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f70221ec8d406b3518f13209479824974f83b87f572048ed9cfb2f273513e766.png"
}
