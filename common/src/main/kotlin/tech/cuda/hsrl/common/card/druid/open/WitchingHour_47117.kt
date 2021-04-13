package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WitchingHour_47117 : Card() {
    override val id = 47117
    override val name = "巫术时刻"
    override val description = "随机召唤一个在本局对战中死亡的友方野兽。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.TheWitchwood
    override val background = "千万要锁好吉尔尼斯宠物墓园的大门！"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f3d9556a35890c3be440534454999c42afb34ac444f9775851e03094f854ccd0.png"
}
