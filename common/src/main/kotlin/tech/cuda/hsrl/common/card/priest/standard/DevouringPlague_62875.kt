package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DevouringPlague_62875 : Card() {
    override val id = 62875
    override val name = "噬灵疫病"
    override val description = "<b>吸血</b> 造成 4点伤害，随机分配到所有敌方随从 身上。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "我们的程序又病了，是01病。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1c64f80aa8543daf1e2f79bcbfd162eb6735f5a79b24b3ce1d8142246d824adb.png"
}
