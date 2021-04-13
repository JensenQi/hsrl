package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FuryRank1_63682 : Card() {
    override val id = 63682
    override val name = "怒火（等级1）"
    override val description = "在本回合中，使你的英雄获得+2攻击力。<i>（当你有5点法力值时升级。）</i>"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "等级3就是你妈妈叫你全名的时候。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8398b8b6cca302566f9de34a1b663abf8cbca5925aee5f0532c77f0cc1fe4a1a.png"
}
