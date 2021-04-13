package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LineHopper_61123 : Card() {
    override val id = 61123
    override val name = "越线的游客"
    override val description = "你的<b>流放</b>牌法力值消耗减少（1）点。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "恶魔猎手最擅长的两件事：翻过障碍，直接切入。"
    override val artist = "K. Lashley & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/009ccc70abe3ea321b6ede31f9bde9fad4188606f4014ca6723bd39a3a35845e.png"
}
