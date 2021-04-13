package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RunicCarvings_59542 : Card() {
    override val id = 59542
    override val name = "雕琢符文"
    override val description = "<b>抉择：</b>召唤四个2/2的树人图腾；或者<b>过载：</b>（2）召唤四个2/2并具有<b>突袭</b>的树人图腾。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“多美的图腾，就这么被你刻毁了……真是符了！”"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/64f05c28f007a745269786175cd1f1410f36f61c638217a59780ab82c931fdc8.png"
}
