package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrimordialProtector_63070 : Card() {
    override val id = 63070
    override val name = "始生保护者"
    override val description = "<b>战吼：</b>抽取你法力值消耗最高的法术牌，随机召唤一个法力值消耗相同的随从。"
    override var cost: Int? = 8
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "《水形物语》讲的应该不是水元素的故事。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a5f03f28dd22a018835472b9c0d2b13c05b1f88c80d3bab0a2b4969d59d3acdb.png"
}
