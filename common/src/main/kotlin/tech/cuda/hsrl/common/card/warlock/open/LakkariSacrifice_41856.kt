package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LakkariSacrifice_41856 : Card() {
    override val id = 41856
    override val name = "拉卡利献祭"
    override val description = "<b>任务：</b>弃掉六张牌。 <b>奖励：</b>虚空传送门。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Ungoro
    override val background = "探险者：“但是，古尔丹，代价是什么呢？” 古尔丹：“弃掉…六张牌…”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/97c0ba9ee8b2bf8b87775f377ddcac347f1490e98647c4eb14c695b9f9757b2c.png"
}
