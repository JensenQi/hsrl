package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CorneredSentry_41406 : Card() {
    override val id = 41406
    override val name = "身陷绝境的哨卫"
    override val description = "<b>嘲讽，战吼：</b> 为你的对手召唤三只1/1的迅猛龙。"
    override var cost: Int? = 2
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Ungoro
    override val background = "德莱尼高层开始考虑取消“带宠物一起上班”这项政策。"
    override val artist = "Jomaro Kindred"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9a6bb6b5b5a983afda8c53315fdf17acf38072ef1fa13ad8cde6a12240e4a8d7.png"
}
