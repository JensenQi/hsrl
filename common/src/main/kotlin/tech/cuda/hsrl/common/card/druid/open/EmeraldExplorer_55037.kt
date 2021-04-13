package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EmeraldExplorer_55037 : Card() {
    override val id = 55037
    override val name = "翡翠龙探险者"
    override val description = "<b>嘲讽</b> <b>战吼：</b><b>发现</b>一张 龙牌。"
    override var cost: Int? = 6
    override var health: Int? = 8
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.DescentOfDragons
    override val background = "再来一条，那就是双截龙啦！"
    override val artist = "A.J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/86a7625a5d31dae4a58ab2f769a92f24bbdb6212fd03cf9c56bd08b88594c07d.png"
}
