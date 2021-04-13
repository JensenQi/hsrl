package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GigglingInventor_48226 : Card() {
    override val id = 48226
    override val name = "欢乐的发明家"
    override val description = "<b>战吼：</b>召唤两个1/2并具有<b>嘲讽</b>和<b>圣盾</b>的 机械。"
    override var cost: Int? = 6
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "“我要发明一个金光闪闪的圣骑士！一个总爱向全世界问好的圣骑士！”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d27f28cea3de1e72905ba812237109d1232f224d809c0e94ce9215b1f9ce12ae.png"
}
