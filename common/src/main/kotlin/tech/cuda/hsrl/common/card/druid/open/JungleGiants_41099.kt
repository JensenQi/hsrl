package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JungleGiants_41099 : Card() {
    override val id = 41099
    override val name = "丛林巨兽"
    override val description = "<b>任务：</b>召唤5个攻击力大于或等于5的随从。 <b>奖励：</b>班纳布斯。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Ungoro
    override val background = "自从一脚踩出了葛拉卡盆地后，班纳布斯的跳舞生涯便宣告结束了。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cf6d0694f4b4ac7cc4e4adf2975460fe3a0c3070a4e9f36c87366b20844e2558.png"
}
