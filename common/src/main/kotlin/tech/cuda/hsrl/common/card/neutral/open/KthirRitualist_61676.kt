package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KthirRitualist_61676 : Card() {
    override val id = 61676
    override val name = "克熙尔祭师"
    override val description = "<b>嘲讽，战吼：</b>随机将一张法力值消耗为（4）的随从牌置入你对手的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "邪恶正在逼近……而且还带了朋友来！"
    override val artist = "Konstantin Porubov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b570e656061acda825ef5bb23b23ad228648caf22f3a270c519585e90d07c916.png"
}
