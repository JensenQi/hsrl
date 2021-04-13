package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CloakedHuntress_39492 : Card() {
    override val id = 39492
    override val name = "神秘女猎手"
    override val description = "你的<b>奥秘</b>牌法力值消耗为（0）点。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Karazhan
    override val background = "她将自己包裹得密不透风，就连马也一样，只为增添那一份神秘感。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e92c08c98e12e1cb662753545bb02632ac3de929ba513847dac3e7df503a1865.png"
}
