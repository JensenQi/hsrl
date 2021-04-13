package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ImmortalPrelate_50022 : Card() {
    override val id = 50022
    override val name = "永恒祭司"
    override val description = "<b>亡语：</b>将该随从洗入你的牌库。保留所有额外效果。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RastakhansRumble
    override val background = "谁说最好的防守就是进攻 能活着撑到最后才行得通"
    override val artist = "Maria Trepalina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4e20d880a0ca25cafcb284ea6735208ee913041ec5af4977785d508190d94a8a.png"
}
