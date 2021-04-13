package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ZuldrakRitualist_55414 : Card() {
    override val id = 55414
    override val name = "祖达克仪祭师"
    override val description = "<b>嘲讽，战吼：</b> 随机为你的对手召唤三个法力值消耗为（1）的随从。"
    override var cost: Int? = 4
    override var health: Int? = 9
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“乐于助人”是他们的核心价值观之一。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bbdeda0a672096f4d168bafa42a92325e13f2f995c334b6cccdc302033179f36.png"
}
