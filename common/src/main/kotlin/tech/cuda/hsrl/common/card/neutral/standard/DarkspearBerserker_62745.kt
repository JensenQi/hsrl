package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkspearBerserker_62745 : Card() {
    override val id = 62745
    override val name = "暗矛狂战士"
    override val description = "<b>亡语：</b>对你的英雄造成5点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“万一我死了，我的英雄也得陪我一起死。”"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1009622989508373918aa44d5571a0b88cb4230872bae548508643ba168fd910.png"
}
