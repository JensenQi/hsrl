package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LostSpirit_46950 : Card() {
    override val id = 46950
    override val name = "迷失的幽魂"
    override val description = "<b>亡语：</b>使你的所有随从获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "她还蛮享受无问西东，随心所欲的感觉。"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c3354ee4bf73f38eb0a80fd240df38e79bc586b3a006d15c42c94b44c73f2302.png"
}
